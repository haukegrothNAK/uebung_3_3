package uebung_3_3;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double koerpergroesse = 1.88;
		double gewicht = 85;
		double alter = 19;
		double ergebnis = gewicht/(koerpergroesse*koerpergroesse);
		boolean maennlich = false;
	
		System.out.println("Ihr BMI beträgt: "+ergebnis);
		if (maennlich){
			if (alter<=24){
				if (ergebnis<20){
					System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
				} else{
					if (ergebnis<=25){
						System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
					} else {
						System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
					}	}
			} else{
				if (alter<=34){
					if (ergebnis<21){
						System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
					} else{
						if (ergebnis<=26){
							System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
						} else {
							System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
						}	}
				} else {
					if (alter<=44){
						if (ergebnis<22){
							System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
						} else{
							if (ergebnis<=27){
								System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
							} else {
								System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
							}	}
					} else {
						if (alter<=54){
							if (ergebnis<23){
								System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
							} else{
								if (ergebnis<=28){
									System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
								} else {
									System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
								}	}
						} else {
							if (alter<=64){
								if (ergebnis<24){
									System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
								} else{
									if (ergebnis<=29){
										System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
									} else {
										System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
									}	}
							} else{
								if (ergebnis<25){
									System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
								} else{
									if (ergebnis<=30){
										System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
									} else {
										System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
									}	}
							}
						}
					}
				}
			}
	} else{ //maennlich = false => weiblich
		if (alter<=24){
			if (ergebnis<19){
				System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
			} else{
				if (ergebnis<=24){
					System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
				} else {
					System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
				}	}
		} else{
			if (alter<=34){
				if (ergebnis<20){
					System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
				} else{
					if (ergebnis<=25){
						System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
					} else {
						System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
					}	}
			} else {
				if (alter<=44){
					if (ergebnis<21){
						System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
					} else{
						if (ergebnis<=26){
							System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
						} else {
							System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
						}	}
				} else {
					if (alter<=54){
						if (ergebnis<22){
							System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
						} else{
							if (ergebnis<=27){
								System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
							} else {
								System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
							}	}
					} else {
						if (alter<=64){
							if (ergebnis<23){
								System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
							} else{
								if (ergebnis<=28){
									System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
								} else {
									System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
								}	}
						} else{
							if (ergebnis<24){
								System.out.println("Der Wert für Ihren BMI ist unterdurchschnittlich.");
							} else{
								if (ergebnis<=29){
									System.out.println("Der Wert für Ihren BMI ist durchschnittlich.");
								} else {
									System.out.println("Der Wert für Ihren BMI ist überdurchschnittlich.");
								}	}
						}
					}
				}
			}
		}
	}

}
}