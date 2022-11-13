import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dad
{
    public String a;
    public String b;
    public boolean c;
    
    public final hhg a() {
        final boolean b = !TextUtils.isEmpty((CharSequence)this.a) || !TextUtils.isEmpty((CharSequence)this.b);
        final boolean b2 = true ^ TextUtils.isEmpty((CharSequence)null);
        if (b && b2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!this.c && !b && !b2) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        final hhg hhg = new hhg((byte[])null, (byte[])null);
        hhg.a = this.a;
        hhg.b = this.b;
        return hhg;
    }
}
