// 
// Decompiled by Procyon v0.6.0
// 

public final class arlb implements arla
{
    public static final qgp a;
    
    static {
        final qgn a2 = new qgn(qgc.a("com.google.android.gms.feedback")).b().a();
        a2.f("AndroidFeedback__fix_suggested_article_crash", true);
        a2.f("AndroidFeedback__select_last_chosen_account_in_email_spinner", true);
        a = a2.f("AndroidFeedback__throw_on_set_screenshot_but_no_pii_allowed", true);
        a2.f("AndroidFeedback__trim_feedback_submission", true);
    }
    
    @Override
    public final boolean a() {
        return (boolean)arlb.a.c();
    }
}
