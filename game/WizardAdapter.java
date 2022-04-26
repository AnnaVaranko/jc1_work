package game;

public class WizardAdapter implements Fighter{

    private Wizard wizard;

    public WizardAdapter() {
        this.wizard = new Wizard();
    }

    @Override
    public void attack() {
        wizard.castDestructionSpell();
    }

    @Override
    public void defend() {
        wizard.shield();
    }

    @Override
    public void escape() {
        wizard.portal();
    }
}
