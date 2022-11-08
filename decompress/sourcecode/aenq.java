import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Locale;
import android.view.LayoutInflater;
import android.content.Context;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aenq extends ContextWrapper implements aenm
{
    private static final afik a;
    private final aeyr b;
    
    static {
        a = afik.m("com/google/apps/tiktok/inject/peer/FragmentContextWrapper");
    }
    
    public aenq(final br br, final Context context) {
        context.getClass();
        b(context, a(br));
        super(context);
        this.b = agnj.E((aeyr)new adfx(this, 15));
    }
    
    public aenq(final br br, final LayoutInflater layoutInflater) {
        final Context context = layoutInflater.getContext();
        context.getClass();
        b(context, a(br));
        super(context);
        this.b = agnj.E((aeyr)new bnh(this, layoutInflater, 20));
    }
    
    private static Locale a(br c) {
        if (c instanceof aenp) {
            final Locale ao = ((aenp)c).aO();
            if (ao != null) {
                return ao;
            }
        }
        c = c.C;
        if (c != null) {
            return a(c);
        }
        return null;
    }
    
    private static void b(final Context context, final Locale locale) {
        if (locale != null) {
            ((afii)((afii)((afig)aenq.a).c()).j("com/google/apps/tiktok/inject/peer/FragmentContextWrapper", "maybeApplyCustomLocale", 46, "FragmentContextWrapper.java")).t("applying customLocale = %s", (Object)locale);
            final Configuration configuration = new Configuration();
            configuration.locale = locale;
            final Resources resources = context.getResources();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }
    
    public final Object getSystemService(final String s) {
        Object o;
        if (!"layout_inflater".equals(s)) {
            o = this.getBaseContext().getSystemService(s);
        }
        else {
            o = this.b.a();
        }
        return o;
    }
}
