import java.io.File;
import java.io.FileFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyq implements FileFilter
{
    public static final dyq a;
    public static final dyq b;
    private final int c;
    
    static {
        b = new dyq(3);
        a = new dyq(2);
    }
    
    public dyq(final int c) {
        this.c = c;
    }
    
    @Override
    public final boolean accept(final File file) {
        final int c = this.c;
        final boolean b = false;
        if (c == 0) {
            final String name = file.getName();
            boolean b2 = b;
            if (name.startsWith("cpu")) {
                for (int i = 3; i < name.length(); ++i) {
                    if (!Character.isDigit(name.charAt(i))) {
                        b2 = b;
                        return b2;
                    }
                }
                b2 = true;
            }
            return b2;
        }
        if (c == 1) {
            return !file.getName().equals("MultiDex.lock");
        }
        if (c != 2) {
            final long a = aeej.a;
            return file.getName().endsWith(".apk");
        }
        return file.getAbsolutePath().contains("_cleanup_mv");
    }
}
