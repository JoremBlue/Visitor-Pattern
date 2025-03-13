public class UnliCallTextPackage implements UnliCallsTextsOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " package UnliCallText: " + unliCallText;
    }
}
