import android.app.AlertDialog$Builder;
import android.view.View;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import android.content.DialogInterface$OnClickListener;
import android.widget.RadioButton;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Map;
import android.view.MenuItem;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrl implements fzi
{
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    
    public jrl(final gey c, final Context b, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public jrl(final vax b, final aibb c, final int a) {
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public jrl(final vax c, final Context b, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int j() {
        final int a = this.a;
        if (a == 0) {
            return 2131427540;
        }
        if (a != 1) {
            return 2131429810;
        }
        return 2131429837;
    }
    
    public final int k() {
        if (this.a != 0) {
            return 0;
        }
        return 2131755009;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final boolean n() {
        return true;
    }
    
    public final void o(final MenuItem menuItem) {
        if (this.a != 1) {
            return;
        }
        menuItem.setShowAsAction(0);
        menuItem.setVisible(true);
    }
    
    public final boolean p() {
        final int a = this.a;
        if (a == 0) {
            final aibb aibb = (aibb)this.c;
            if ((aibb.b & 0x8000) != 0x0) {
                final Object b = this.b;
                aioe aioe;
                if ((aioe = aibb.o) == null) {
                    aioe = aioe.a;
                }
                ((vax)b).c(aioe, (Map)null);
            }
            return true;
        }
        if (a != 1) {
            final gey gey = (gey)this.c;
            if (gey.g == null) {
                final View inflate = LayoutInflater.from(gey.a).inflate(2131624578, (ViewGroup)null);
                gey.d = (RadioButton)inflate.findViewById(2131429399);
                gey.e = (RadioButton)inflate.findViewById(2131429400);
                gey.f = (RadioButton)inflate.findViewById(2131429398);
                (gey.h = gey.b.n()).D((wxz)new wws(wya.c(35087)));
                gey.h.D((wxz)new wws(wya.c(35088)));
                gey.h.D((wxz)new wws(wya.c(35086)));
                gey.g = ((AlertDialog$Builder)gey.i.af(gey.a)).setView(inflate).setTitle(2132018656).setPositiveButton(2132018938, (DialogInterface$OnClickListener)new ceg(gey, 3)).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setCancelable(true).create();
            }
            final int a2 = gey.c.a();
            if (a2 == 2) {
                gey.d.setChecked(true);
            }
            else if (a2 == 1) {
                gey.e.setChecked(true);
            }
            else if (a2 == 0) {
                gey.f.setChecked(true);
            }
            gey.g.show();
            return true;
        }
        final agza builder = ahtj.a.createBuilder();
        final String string = Integer.toString(10013);
        builder.copyOnWrite();
        final ahtj ahtj = (ahtj)builder.instance;
        string.getClass();
        ahtj.b |= 0x8;
        ahtj.e = string;
        final ahtj ahtj2 = (ahtj)builder.build();
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint, (Object)ahtj2);
        ((vax)this.c).c((aioe)((agza)agzc).build(), (Map)null);
        return true;
    }
    
    public final int q() {
        if (this.a != 1) {
            return 0;
        }
        return 102;
    }
    
    public final CharSequence r() {
        final int a = this.a;
        if (a == 0) {
            return "";
        }
        if (a != 1) {
            return ((Context)this.b).getString(2132018656);
        }
        return ((Context)this.b).getString(2132018660);
    }
}
