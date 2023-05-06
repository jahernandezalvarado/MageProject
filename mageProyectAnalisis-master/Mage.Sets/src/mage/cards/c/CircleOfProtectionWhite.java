
package mage.cards.c;

import java.util.UUID;
import mage.ObjectColor;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.PreventNextDamageFromChosenSourceToYouEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Zone;
import mage.filter.FilterObject;
import mage.filter.predicate.mageobject.ColorPredicate;

/**
 *
 * @author Plopman
 */
public final class CircleOfProtectionWhite extends CardImpl {

    private static final FilterObject filter = new FilterObject("white source");

    static {
        filter.add(new ColorPredicate(ObjectColor.WHITE));
    }

    public CircleOfProtectionWhite(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{1}{W}");


        // {1}: The next time a white source of your choice would deal damage to you this turn, prevent that damage.
        Effect effect = new PreventNextDamageFromChosenSourceToYouEffect(Duration.EndOfTurn, filter);
        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD, effect, new ManaCostsImpl<>("{1}")));
    }

    private CircleOfProtectionWhite(final CircleOfProtectionWhite card) {
        super(card);
    }

    @Override
    public CircleOfProtectionWhite copy() {
        return new CircleOfProtectionWhite(this);
    }
}