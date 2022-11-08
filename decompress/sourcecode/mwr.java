import com.google.android.gms.feedback.FeedbackOptions;
import java.security.SecureRandom;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Bitmap;
import android.app.ApplicationErrorReport;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwr
{
    public final Bundle a;
    public String b;
    public String c;
    public boolean d;
    public ApplicationErrorReport e;
    private Bitmap f;
    private String g;
    private final List h;
    private boolean i;
    private String j;
    private nan k;
    
    @Deprecated
    public mwr() {
        this.a = new Bundle();
        this.h = new ArrayList();
        this.e = new ApplicationErrorReport();
        this.j = meo.s();
    }
    
    public mwr(final Context context) {
        noa.b(context);
        this.a = new Bundle();
        this.h = new ArrayList();
        this.e = new ApplicationErrorReport();
        try {
            String j;
            if (mww.b.a()) {
                final long currentTimeMillis = System.currentTimeMillis();
                final long abs = Math.abs(new SecureRandom().nextLong());
                final StringBuilder sb = new StringBuilder();
                sb.append(currentTimeMillis);
                sb.append("_");
                sb.append(abs);
                j = sb.toString();
            }
            else {
                j = meo.s();
            }
            this.j = j;
        }
        catch (final SecurityException ex) {
            this.j = meo.s();
        }
    }
    
    public final FeedbackOptions a() {
        final FeedbackOptions feedbackOptions = new FeedbackOptions(new ApplicationErrorReport());
        feedbackOptions.m = this.f;
        feedbackOptions.f = null;
        feedbackOptions.a = this.g;
        feedbackOptions.c = this.b;
        feedbackOptions.b = this.a;
        feedbackOptions.e = this.c;
        feedbackOptions.h = this.h;
        feedbackOptions.i = this.d;
        feedbackOptions.j = null;
        feedbackOptions.k = null;
        feedbackOptions.l = this.i;
        feedbackOptions.r = this.k;
        feedbackOptions.n = this.j;
        feedbackOptions.o = false;
        feedbackOptions.p = 0L;
        feedbackOptions.q = false;
        return feedbackOptions;
    }
    
    public final void b(final boolean i) {
        if ((this.a.isEmpty() && this.h.isEmpty()) || this.i == i) {
            this.i = i;
            return;
        }
        throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
    }
    
    public final void c() {
        this.g = "anonymous";
    }
    
    public final void d(final Bitmap f) {
        if (this.d && arkz.a.b().a()) {
            throw new IllegalStateException("Can't call setScreenshotBitmap after report is already certified pii free.");
        }
        this.f = f;
    }
    
    public final void e(final nan k) {
        this.b(false);
        this.k = k;
    }
}
