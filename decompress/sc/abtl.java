import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtl
{
    public final int a;
    final abtp b;
    final abtn c;
    
    public abtl(final int a, final abtp b, final abtn c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        return String.format(Locale.getDefault(), "id: %d text: %s settings: %s", this.a, this.b, this.c);
    }
}
