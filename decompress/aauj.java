import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aauj extends aass
{
    public final aaud a;
    public final aaud b;
    private final aaud c;
    
    public aauj(final aavf aavf, final acjq acjq, final byte[] array, final byte[] array2) {
        final aaud q = acjq.q(aavf.a(), 0.0f, 40.0f);
        (this.a = q).h(17);
        q.B(true, true);
        q.z(-7829368);
        q.A(2.0f);
        ((aarh)q).k(0.0f, 6.0f, 0.0f);
        this.m((aatp)q);
        ((aatr)q).rS(true);
        final aaud q2 = acjq.q(aavf.a(), 40.0f, 0.0f);
        (this.b = q2).B(false, true);
        q2.A(2.0f);
        q2.h(1);
        ((aarh)q2).k(0.0f, 2.0f, 0.0f);
        q2.g((aauc)new aaui(this));
        this.m((aatp)q2);
        final aaud q3 = acjq.q(aavf.a(), 40.0f, 0.0f);
        (this.c = q3).B(false, true);
        q3.A(1.5f);
        q3.h(1);
        this.m((aatp)q3);
    }
    
    public final void a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            this.c.y("");
            ((aatr)this.c).rS(true);
            return;
        }
        final aaud c = this.c;
        String concat = s;
        if (s.length() > 40) {
            concat = String.valueOf(s.substring(0, 37)).concat("...");
        }
        c.y(concat);
        ((aatr)this.c).rS(false);
    }
    
    public final void b(final String s) {
        this.b.y(s);
    }
}
