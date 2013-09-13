package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import models.Country;
import models.Province;
import readers.DataReader;

public class Main {

	private static boolean[] asked = new boolean[50];
	private static Random rand = new Random();
	private static boolean stopTimer = false;
	private static boolean isTimeUp = false;

	public static void main(String[] args) {
		DataReader dr = new DataReader();
		Country af = dr.getAfghanistan();

		Country[] countries = { af };

		System.out
				.println("Welcome to Geography Game\nPlease choose a country by typing the number:");

		System.out.println();
		for (int i = 0; i < countries.length; i++) {
			System.out.println((i + 1) + " " + countries[i].getName());
		}

		Scanner input = new Scanner(System.in);
		boolean stop = false;
		while (!stop) {
			int country = 0;
			try {
				country = input.nextInt();

				if (country >= 1 && country <= countries.length) {
					System.out.println();
					System.out
							.println("----------------------------**********-----------------------------");
					System.out.println("Let's learn the Geography of "
							+ countries[country - 1].getName()
							+ " through a game.");
					System.out.println("Enter S when you are ready to begin.");

					while (!stop) {
						String start = input.next();

						if ("s".equalsIgnoreCase(start)) {
							stop = startGame(countries[country - 1]);
						} else {
							System.out.println("Wrong input!");
						}
					}
				} else {
					System.out.println("Wrong input!");
				}
			} catch (Exception e) {
				System.out.println("You must enter a number between 1 and "
						+ countries.length);
			}
		}
	}

	private static boolean startGame(Country country)
			throws FileNotFoundException {
		Province[] provinces = country.getProvinces();
		int points = 0;
		boolean endGame = false;
		while (!endGame) {
			// pick a province at random
			int province = getRandomProvince(provinces);

			// mark this province as being used in a question
			asked[province] = true;

			isTimeUp = false;
			stopTimer = false;
			System.out.println("--------------------------");
			System.out.println("What is the capital of "
					+ provinces[province].getName() + " province?");
			System.out.println();

			String[] answers = new String[4];
			int realAnswer = rand.nextInt(answers.length);
			answers[realAnswer] = provinces[province].getCapital().getName();
			for (int j = 0; j < answers.length; j++) {
				if (j != realAnswer) {
					int p = rand.nextInt(provinces.length);
					String value = provinces[p].getCapital().getName();
					while (contains(value, answers)) {
						p = rand.nextInt(provinces.length);
						value = provinces[p].getCapital().getName();
					}
					answers[j] = value;
				}
			}
			// display the answers list to the user
			for (int i = 0; i < answers.length; i++) {
				System.out.println((i + 1) + " " + answers[i]);
			}

			Thread timer = new Thread(new Runnable() {

				@Override
				public void run() {
					int secs = 10;
					int i = 0;
					while (i < secs) {
						if (stopTimer()) {
							break;
						}
						System.out.print("+");

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						i++;
					}
					timeIsUp();
				}
			});
			timer.start();

			InputStreamReader inputStream = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(inputStream);
			int answer = 0;
			while (true) {
				try {
					while (!isTimeUp) {
						if (input.ready())
							break;
					}
					if (!isTimeUp) {
						Scanner in = new Scanner(input.readLine());
						answer = in.nextInt();
					}
					break;
				} catch (InputMismatchException e) {
					System.out
							.println("You must enter a number between 1 and 4!!!");

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			stopTimer = true;

			System.out.println();
			System.out.println("--------------------------");
			if (answer - 1 == realAnswer) {
				System.out.println("CORRECT!");
				points++;
			} else {
				System.out.println("WRONG!");
				points--;
			}
			System.out.println("Points: " + points);
			System.out.println("Enter C to continue, or Q to stop the game.");

			Scanner inpt = new Scanner(System.in);
			while (true) {
				String in = inpt.next();
				if ("c".equalsIgnoreCase(in)) {
					break;
				} else if ("q".equalsIgnoreCase(in)) {
					System.out.println("Bye!");
					endGame = true;
					break;
				} else {
					System.out.println("Wrong Input! You must enter C or Q.");
				}
			}
		}

		return true;

	}

	protected static void timeIsUp() {
		isTimeUp = true;
	}

	protected static boolean stopTimer() {
		return stopTimer;
	}

	private static boolean contains(String value, String[] list) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null && list[i].equals(value))
				return true;
		}
		return false;
	}

	private static int getRandomProvince(Province[] provinces) {
		int province = rand.nextInt(provinces.length);
		int i = 0;
		while (asked[province]) {
			province = rand.nextInt(provinces.length);
			i++;
			if (i == provinces.length) {
				asked = new boolean[50];
				break;
			}
		}
		return province;

	}

}