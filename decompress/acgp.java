import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgp implements ott
{
    private final Context a;
    
    public acgp(final Context a) {
        this.a = a;
    }
    
    private final void d(final int n) {
        Toast.makeText(this.a, (CharSequence)this.a.getString(n), 1).show();
    }
    
    public final ahci a() {
        return aqny.b;
    }
    
    public final /* bridge */ asjy b(final Object o, final ots ots) {
        return asjy.u((asmc)new sqx(this, (aqny)o, 20));
    }
    
    public final void c(final aqny aqny) {
        final String d = aqny.d;
        if (TextUtils.isEmpty((CharSequence)d)) {
            this.d(2132017998);
            return;
        }
        final Intent intent = new Intent("android.intent.action.VIEW", tqf.cL(d));
        try {
            this.a.startActivity(intent.setFlags(268435456));
        }
        catch (final ActivityNotFoundException ex) {
            this.d(2132017988);
        }
    }
}
