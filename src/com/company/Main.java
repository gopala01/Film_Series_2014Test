package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        films harryPotterFilm = HarryPotter();
        films twilightFilm = Twilight();
        films[] filmArray = new films[]{harryPotterFilm, twilightFilm};

        String filmSeries = inputString("Film Series?");


        for (int i = 0; i < filmArray.length; i++) {
            while (filmSeries.equals(getName(filmArray[i])))
            {
                if (filmSeries.equals(getName(filmArray[i])))
                {
                    Return(filmArray[i]);
                    i = 0; //To return to the first element incase we need to search for the first element again
                }
                filmSeries = inputString("Film Series?");
            }
        }
        print("I will return!");

    }
    public static void Return(films f)
    {
        String character = inputString("Character");
        for (int i = 0; i < f.Actor.length; i++) {
            if (character.equals(getCharacter(f, i)))
            {
                print(getActor(f, i) + " plays " + getCharacter(f, i) + " in the " + getName(f) + " series");
            }
        }
    }
    public static films HarryPotter()
    {
        films harryPotter = new films();
        harryPotter.Name = "Harry Potter";
        harryPotter.Characters = new String[]{"Harry", "Hermione"};
        harryPotter.Actor = new String[]{"Daniel Radcliffe", "Emma Watson"};
        return harryPotter;
    }

    public static films Twilight()
    {
        films twilight = new films();
        twilight.Name = "Twilight";
        twilight.Characters = new String[]{"Edward", "Bella"};
        twilight.Actor = new String[]{"Robert Pattinson", "Kristen Stewart"};
        return twilight;
    }

    public static String getName(films f)
    {
        return f.Name;
    }

    public static String getCharacter(films f, int i)
    {
        return f.Characters[i];
    }
    public static String getActor(films f, int i)
    {
        return f.Actor[i];
    }
    public static void print(String m)
    {
        System.out.println(m);
    }

    public static String inputString(String m)
    {
        String answer;
        Scanner scanner = new Scanner(System.in);
        print(m);
        answer = scanner.nextLine();
        return answer;
    }
}

class films{
    String Name;
    String[] Characters;
    String[] Actor;
}

class filmActor{
    String name;
}
