public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    Fighter first = fighter1, second = fighter2;
    if ( fighter2.name == firstAttacker ) {
      first = fighter2;
      second = fighter1;
    }

    do {
      second.health -= first.damagePerAttack;
      if ( second.health <= 0 ) break;
      first.health -= second.damagePerAttack;
    } while (first.health > 0);
    return ( first.health > second.health ) ? first.name : second.name;
  }
}
