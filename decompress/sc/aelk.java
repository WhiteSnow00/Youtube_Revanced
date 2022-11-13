import java.util.Set;
import java.io.File;
import java.io.FilenameFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelk implements FilenameFilter
{
    public final Object a;
    private final int b;
    
    public aelk(final aell a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aelk(final aelm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aelk(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean accept(final File file, final String s) {
        final int b = this.b;
        if (b == 0) {
            final Object a = this.a;
            String s2;
            if (!s.endsWith("-wal") && !s.endsWith("-shm")) {
                s2 = s;
                if (s.endsWith("-journal")) {
                    s2 = s.substring(0, s.length() - 8);
                }
            }
            else {
                s2 = s.substring(0, s.length() - 4);
            }
            return s2.startsWith("SqliteKeyValueCache:") && s2.endsWith(".db") && !((Set)((afev)((aell)a).b).s()).contains(s2);
        }
        if (b != 1) {
            final Object a2 = this.a;
            String s3;
            if (!s.endsWith("-wal") && !s.endsWith("-shm")) {
                s3 = s;
                if (s.endsWith("-journal")) {
                    s3 = s.substring(0, s.length() - 8);
                }
            }
            else {
                s3 = s.substring(0, s.length() - 4);
            }
            return s3.startsWith("SqliteKeyValueCache:") && s3.endsWith(":Singleton.db") && !((Set)((afev)((aelm)a2).c).s()).contains(s3);
        }
        return s.startsWith((String)this.a);
    }
}
