package mage.cards.h;

import mage.MageInt;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class HellkitePunisher extends CardImpl {

    public HellkitePunisher(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{5}{R}{R}");

        this.subtype.add(SubType.DRAGON);
        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // {R}: Hellkite Punisher gets +1/+0 until end of turn.
        this.addAbility(new SimpleActivatedAbility(
                new BoostSourceEffect(1, 0, Duration.EndOfTurn), new ManaCostsImpl<>("{R}")
        ));
    }

    private HellkitePunisher(final HellkitePunisher card) {
        super(card);
    }

    @Override
    public HellkitePunisher copy() {
        return new HellkitePunisher(this);
    }
}
