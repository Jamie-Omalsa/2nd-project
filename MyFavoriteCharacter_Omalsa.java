import java.awt.*;
import javax.swing.*;
import java.util.*; 

/* 
	Programmer's Name: Omalsa, Jamie I.
	Grade, Strand, Section: 12 ICT Microsoft
	Date Coded: May 18, 2021
	Date finished: May 20, 2021
	Contact Details: 639197577531
*/ 	

public class MyFavoriteCharacter_Omalsa extends JFrame
{	
	public void paint (Graphics g)
	{
		
		Color cLightBlue  = new Color (80, 208, 255);
		Color cBlack  = new Color (0, 0, 0);
		Color cYellow  = new Color (255, 224, 32);
		Color cRed  = new Color (255, 0, 0);
		Color cWhite = new Color (255, 255, 255);
		Color cPinkpeach = new Color (248, 150, 133);
		Color cDirtyWhite = new Color (232,  228, 201);
		Color cLightBrown = new Color (213,  196, 161);
		Color cBrown = new Color (165,  113, 78);
		Color cGray = new Color (128,  128, 128);
		Color cBrown1 = new Color (195,  156, 107);
		Color cWhiteSmoke = new Color (245, 245, 245);
		Color cRBrown = new Color (216, 152, 129);
		
		
		
		
		//Background of Doraemon
		
		int[] xWall = {1,  53,  50,  1};
		int[] yWall = {1,  1,  413, 412};
		g.setColor(cLightBrown);
		g.fillPolygon(xWall, yWall, 4);
		
		int[] xSwitch1 = {1,  33,  33,  1};
		int[] ySwitch1 = {54, 54,  150, 150};
		g.setColor(cDirtyWhite);
		g.fillPolygon(xSwitch1, ySwitch1, 4);
		
		int[] xSwitch = {2,  18,  20,  1};
		int[] ySwitch = {95, 95,  113, 113};
		g.setColor(cGray);
		g.fillPolygon(xSwitch, ySwitch, 4);
		
		int[] xDoorJamb = {51, 51,  115, 115};
		int[] yDoorJamb = {2,  414, 414, 2};
		g.setColor(cBrown1);
		g.fillPolygon(xDoorJamb, yDoorJamb, 4);
		
		int[] xDoor = {115, 115, 687, 687};
		int[] yDoor = {  2, 414, 414, 2};
		g.setColor(cRBrown);
		g.fillPolygon(xDoor, yDoor, 4);
		
		int[] xDoorJamb1 = {687, 737, 737, 687};
		int[] yDoorJamb1 = {  2,   2, 414, 414};
		g.setColor(cBrown1);
		g.fillPolygon(xDoorJamb1, yDoorJamb1, 4);
		
		
		
		//Body of Doraemon
		int[] xBody = {221, 208, 191, 182, 176, 528, 541, 557, 576, 591, 604, 580, 560, 532, 507};
		int[] yBody = {372, 383, 398, 407, 415, 415, 405, 389, 369, 352, 329, 290, 300, 313, 329};
		g.setColor(cBlack);
		//g.drawPolygon(xBody, yBody, 15);
		g.setColor(cLightBlue);
		g.fillPolygon(xBody, yBody, 15);
		
		//Body of Doraemon
		g.setColor(cBlack);
		g.drawLine(223, 399, 217, 408);

		//Body of Doraemon
		g.setColor(cBlack);
		g.drawLine(499, 406, 497, 397);
		
		//Hand of Doraemon
		int[] xHand = {643, 632, 617, 601, 589, 581, 580, 584, 593, 605, 619, 635, 647, 654, 654, 652};
		int[] yHand = {265, 258, 255, 259, 268, 283, 297, 308, 320, 327, 330, 327, 317, 305, 287, 275};
		g.setColor(cBlack);
		//g.drawPolygon(xHand, yHand, 16);
		g.setColor(cWhite);
		g.fillPolygon(xHand, yHand, 16);
		
		//Head of Doraemon
		int[] xHead = {348, 330, 315, 297, 281, 263, 247, 230, 215, 200, 187, 174, 164, 156, 149, 144, 142, 142, 144, 150, 156, 164, 173, 188, 202, 217, 225, 242, 262, 282, 303, 322, 344, 363, 385, 411, 431, 451, 467, 485, 498, 511, 522, 532, 542, 549, 552, 554, 552, 545, 536, 522, 509, 492, 475, 458, 442, 424, 401, 381, 364, 348 };
		int[] yHead = {21,  22,  24,  28,  32,  39,  46,  56,  67,  79,  93,  110, 125, 142, 162, 184, 202, 218, 240, 260, 275, 292, 307, 326, 341, 353, 360, 363, 365, 366, 366, 367, 366, 365, 364, 362, 359, 355, 352, 347, 336, 320, 305, 289, 268, 248, 223, 199, 171, 147, 124, 105, 87,  72,  60,  48,  39,  30,  24,  21,  20,  21};
		
		g.setColor(cBlack);
		//g.drawPolygon(xHead, yHead, 62);
		g.setColor(cLightBlue);
		g.fillPolygon(xHead, yHead, 62);
		
		//Face of Doraemon
		int[] xFace = {260, 244, 228, 215, 204, 191, 180, 172, 166, 160, 158, 157, 160, 166, 174, 185, 198, 211, 228, 241, 259, 279, 300, 319, 342, 363, 383, 403, 425, 444,  461, 479, 492, 501, 511, 521, 530, 537, 541, 543, 544, 541, 538, 530, 522, 507, 492,  471, 453, 434};
		int[] yFace = {90,  96,  103, 113, 123, 134, 147, 161, 175, 193, 211, 232, 253, 273, 294, 314, 331, 346, 360, 363, 364, 366, 366, 367, 368, 365, 364, 362, 361, 356,  353, 349, 338, 325, 312, 296, 281, 263, 245, 226, 214, 192, 176, 159, 141, 125, 109,  96,   88,  83};
		
		g.setColor(cBlack);
		//g.drawPolygon(xFace, yFace, 50);
		g.setColor(cWhite);
		g.fillPolygon(xFace, yFace, 50);
		
		//Eyes of Doraemon
		int[] xEyes = {347, 345, 342, 337, 321, 304, 287, 275, 267, 263, 268, 278, 293, 309, 324, 334, 344, 347, 347};
		int[] yEyes = {84,  67,  54, 42,   32,  31,  37,  50,  65,  84,  105, 124, 135, 138, 135, 128, 117, 100, 83};
		
		g.setColor(cBlack);
		g.drawPolygon(xEyes, yEyes, 19);
		g.setColor(cWhite);
		g.fillPolygon(xEyes, yEyes, 19);
		
		//Eyes of Doraemon
		int[] xEyes2 = {349, 350, 359, 371, 387, 404, 415, 424, 426, 426, 423, 409, 391, 372, 356, 351, 351};
		int[] yEyes2 = {67,  55,  40,  31,  27, 33,   43,  58,  72,  88,  108, 124, 132, 128, 119, 104, 84};
		g.setColor(cBlack);
		g.drawPolygon(xEyes2, yEyes2, 17);
		g.setColor(cWhite);
		g.fillPolygon(xEyes2, yEyes2, 17);
		
		//Iris of Doraemon
		int[] xIris =  {330,324, 323, 325, 330, 338, 340, 339, 337};
		int[] yIris =  {73, 79,  87,  95,  100,  96, 88,  82,  77};
		g.setColor(cBlack);
		//g.drawPolygon(xIris, yIris, 9);
		g.setColor(cBlack);
		g.fillPolygon(xIris, yIris, 9);
		
		//Iris of Doraemon
		int[] xIris2 = {363, 358, 357, 358, 362, 371, 372, 372, 369};
		int[] yIris2 = {71,  76,  83,   91,  97, 92,  85,  79,   74};
		g.setColor(cBlack);
		//g.drawPolygon(xIris2, yIris2, 9);
		g.setColor(cBlack);
		g.fillPolygon(xIris2, yIris2, 9);
		
		//Pupil of Doraemon
		int[] xPupil = {332, 329, 330, 335, 336};
		int[] yPupil = {82,  85,  90,  90,  85};
		g.setColor(cBlack);
		//g.drawPolygon(xPupil, yPupil, 5);
		g.setColor(cWhite);
		g.fillPolygon(xPupil, yPupil, 5);
		
		//Pupil2 of Doraemon
		int[] xPupil2 = {363, 359, 360, 366, 367};
		int[] yPupil2 = {80,  84,  89,  90,  83};
		g.setColor(cBlack);
		g.drawPolygon(xPupil2, yPupil2, 5);
		g.setColor(cWhite);
		g.fillPolygon(xPupil2, yPupil2, 5);
		
		//Nose of Doraemon
		int[] xNose = {349, 339, 331, 330, 334, 340, 352, 361, 368, 370, 369, 365, 358, 340};
		int[] yNose = {120, 121, 131, 142, 153, 161, 161, 158, 150, 141, 133, 124, 120, 119};
		g.setColor(cBlack);
		//g.drawPolygon(xNose, yNose, 13);
		g.setColor(cRed);
		g.fillPolygon(xNose, yNose, 13);
		
		//Nose2 of Doraemon
		int[] xNose2 = {348, 340, 341, 348, 355, 355};
		int[] yNose2 = {124, 129, 136, 140, 137, 128};
		g.setColor(cBlack);
		//g.drawPolygon(xNose2, yNose2, 6);
		g.setColor(cWhite);
		g.fillPolygon(xNose2, yNose2, 6);
		
		//Line under the nose of Doraemon
		g.setColor(cBlack);
		g.drawLine(352, 161, 352, 212);
		
		//Whisker of Doraemon
		g.setColor(cBlack);
		g.drawLine(268, 146, 186, 111);
		g.drawLine(262, 174, 153, 155);
		g.drawLine(259, 207, 158, 221);
		g.drawLine(430, 132, 509, 93);
		g.drawLine(439, 167, 535, 141);
		g.drawLine(444, 199, 550, 199);
		
		
		//Mouth of Doraemon
		int[] xMouth = {187, 192, 202, 214, 227, 242, 259, 281, 304, 340, 370, 402, 430, 454, 474, 491, 501, 510};
		int[] yMouth = {243, 262, 281, 299, 315, 326, 334, 345, 353, 358, 357, 350, 340, 327, 307, 287, 262, 235};
		g.setColor(cBlack);
		//g.drawPolygon(xMouth, yMouth, 18);
		g.setColor(cRed);
		g.fillPolygon(xMouth, yMouth, 18);
		
		//Tounge of Doraemon
		int[] xTounge = {370, 341, 304, 281, 259, 243, 223, 236, 248, 266, 289, 313, 333, 352, 369, 395, 425, 449, 457, 480, 474, 454, 430, 401};
		int[] yTounge = {356, 357, 353, 346, 336, 328, 318, 292, 278, 264, 255, 255, 262, 270, 259, 252, 250, 259, 275, 296, 309, 326, 342, 350};
		g.setColor(cBlack);
		//g.drawPolygon(xTounge, yTounge, 24);
		g.setColor(cPinkpeach);
		g.fillPolygon(xTounge, yTounge, 24);
		
		
		//Collar of Doraemon
		int[] xCollar = {334, 300, 274, 248, 224, 226, 248, 272, 300, 335, 383, 420, 455, 485, 479, 466, 440, 411, 383};
		int[] yCollar = {382, 381, 380, 377, 371, 360, 364, 366, 368, 367, 365, 360, 355, 349, 361, 366, 371, 376, 379};
		g.setColor(cBlack);
		//g.drawPolygon(xCollar, yCollar, 19);
		g.setColor(cRed);
		g.fillPolygon(xCollar, yCollar, 19);
		
		//Bell of  Doraemon
		int[] xBell = {359, 345, 337, 335, 346, 361, 374, 385, 383, 375};
		int[] yBell = {369, 374, 383, 402, 415, 415, 415, 401, 382, 374};
		g.setColor(cBlack);
		g.drawPolygon(xBell, yBell, 10);
		g.setColor(cYellow);
		g.fillPolygon(xBell, yBell, 10);
		
		
		

		
		
		
		
		
		
	}
	
	public static void main(String[] args)
	{
		MyFavoriteCharacter_Omalsa mfco = new MyFavoriteCharacter_Omalsa ();
		mfco.setSize (800, 450);
		mfco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mfco.setVisible(true);
	
	}
	
}
