import android.text.Spanned;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import android.text.TextUtils;
import android.widget.Space;
import android.widget.TextView;
import android.content.Context;
import android.view.LayoutInflater;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfq implements acil
{
    private final fuw a;
    private final ViewGroup b;
    private final ViewGroup c;
    private fuv d;
    private final /* synthetic */ int e;
    private final Object f;
    private final Object g;
    private final View h;
    
    public kfq(final Activity activity, final alm g, final fwu f, final fuw a, final int e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.g = g;
        final ViewGroup c = (ViewGroup)LayoutInflater.from((Context)activity).inflate(2131624606, (ViewGroup)null);
        this.c = c;
        this.h = c.findViewById(2131431798);
        this.f = f;
        this.a = a;
        this.b = (ViewGroup)c.findViewById(2131427938);
    }
    
    public kfq(final Activity activity, final fuw a, final giz f, final int e) {
        this.e = e;
        this.a = a;
        this.f = f;
        final ViewGroup b = (ViewGroup)LayoutInflater.from((Context)activity).inflate(2131624607, (ViewGroup)null);
        this.b = b;
        this.g = b.findViewById(2131432092);
        this.h = b.findViewById(2131431621);
        this.c = (ViewGroup)b.findViewById(2131431798);
        ((acio)f).c((View)b);
    }
    
    public final View a() {
        if (this.e != 0) {
            return (View)this.c;
        }
        return (View)this.b;
    }
    
    public final void c(final acir acir) {
        if (this.e != 0) {
            return;
        }
        tmy.v(this.h, false);
    }
}
