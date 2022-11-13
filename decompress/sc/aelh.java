import java.io.File;
import java.io.FilenameFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelh implements FilenameFilter
{
    public final afft a;
    public final afft b;
    public final boolean c;
    
    public aelh(final afft a, final afft b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean accept(File file, final String s) {
        final afft a = this.a;
        final afft b = this.b;
        final boolean c = this.c;
        file = new File(file, s);
        boolean b2 = false;
        try {
            final Integer value = Integer.valueOf(s);
            if (value >= 0) {
                if (a == null || !a.contains((Object)value)) {
                    if (b == null || b.contains((Object)value)) {
                        if (file.isDirectory()) {
                            if (c && !file.canWrite()) {
                                return false;
                            }
                            b2 = true;
                        }
                    }
                }
            }
            return b2;
        }
        catch (final NumberFormatException ex) {
            return b2;
        }
    }
}
