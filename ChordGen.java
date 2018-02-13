package com.java.mellow;

public class ChordGen
{

	 private int minorOctave = this.getOctave();
	private int octave = this.getOctave();
	public ChordGen()
	{

	}
// generates a number that represents an octave on a piano
	public int getOctave()
	{
		int octave = 0;
		octave = (int) (Math.random() * 7) + 1;
		return octave;
	}
// returns a major chord with a given octave 
	public String majorChord()
	{
		int chord = 0;
		chord = (int) (Math.random() * 12) + 1;
		switch (chord)
		{
		case 1:
			return "C E G" + ": " + octave;
		case 2:
			return "C# E# G#" + ": " + octave;
		case 3:
			return "D F# A" + ": " + octave;
		case 4:
			return "Eb G Bb" + ": " + octave;
		case 5:
			return "E G# B" + ": " + octave;
		case 6:
			return "F A C" + ": " + octave;
		case 7:
			return "F# A# C#" + ": " + octave;
		case 8:
			return "G B D" + ": " + octave;
		case 9:
			return "Ab C Eb" + ": " + octave;
		case 10:
			return "A C# E" + ": " + octave;
		case 11:
			return "Bb D F" + ": " + octave;
		case 12:
			return "B D# F#" + ": " + octave;
		default:
			return null;
		}

	}
// returns a minor chord with a given octave
	public String minorChord()
	{
		int minorChord1 = 0;
		minorChord1 = (int) (Math.random() * 12) + 1;
		switch (minorChord1)
		{
		case 1:
			return "C Eb G" + ": " + minorOctave;
		case 2:
			return "C# E G#" + ": " + minorOctave;
		case 3:
			return "D F A" + ": " + minorOctave;
		case 4:
			return "Eb Gb Bb" + ": " + minorOctave;
		case 5:
			return "E G B" + ": " + minorOctave;
		case 6:
			return "F Ab C" + ": " + minorOctave;
		case 7:
			return "F# A C#" + ": " + minorOctave;
		case 8:
			return "G Bb D" + ": " + minorOctave;
		case 9:
			return "Ab B Eb" + ": " + minorOctave;
		case 10:
			return "A C E" + ": " + minorOctave;
		case 11:
			return "Bb Db F" + ": " + minorOctave;
		case 12:
			return "B D F#" + ": " + minorOctave;
		default:
			return null;
		}
	}
	public static void main(String args[])
	{
		ChordGen generator = new ChordGen();
		System.out.println(generator.majorChord());
		System.out.println(generator.majorChord());
		System.out.println(generator.minorChord());
		System.out.println(generator.minorChord());
	}

}
