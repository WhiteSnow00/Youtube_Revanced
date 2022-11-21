import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.AlertDialog$Builder;
import android.view.View;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaje
{
    public final Context a;
    public final veh b;
    public final AlertDialog c;
    public final TextView d;
    public final TextView e;
    public xab f;
    public aies g;
    public aies h;
    private final View i;
    
    public aaje(final Context a, final AlertDialog$Builder alertDialog$Builder, final veh b) {
        this.a = a;
        this.b = b;
        final View inflate = LayoutInflater.from(a).inflate(2131625685, (ViewGroup)null);
        this.i = inflate;
        this.d = (TextView)inflate.findViewById(2131428669);
        this.e = (TextView)inflate.findViewById(2131428665);
        this.c = alertDialog$Builder.setView(inflate).create();
    }
}
