// 
// Decompiled by Procyon v0.6.0
// 

public final class arqe implements arqd
{
    public static final qis a;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.feedback")).b().a();
        a2.f("AndroidFeedback__fix_suggested_article_crash", true);
        a2.f("AndroidFeedback__select_last_chosen_account_in_email_spinner", true);
        a = a2.f("AndroidFeedback__throw_on_set_screenshot_but_no_pii_allowed", true);
        a2.f("AndroidFeedback__trim_feedback_submission", true);
    }
    
    @Override
    public final boolean a() {
        return (boolean)arqe.a.c();
    }
}
