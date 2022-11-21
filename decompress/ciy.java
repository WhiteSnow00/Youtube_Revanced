import android.os.Build$VERSION;
import java.io.IOException;
import java.io.Closeable;
import android.net.Uri;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import androidx.work.impl.WorkDatabase;
import android.view.ViewGroupOverlay;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ciy
{
    static ViewGroupOverlay a(final ViewGroup viewGroup, final View view) {
        final ViewGroupOverlay overlay = viewGroup.getOverlay();
        overlay.add(view);
        return overlay;
    }
    
    static ViewGroupOverlay b(final ViewGroup viewGroup, final View view) {
        final ViewGroupOverlay overlay = viewGroup.getOverlay();
        overlay.remove(view);
        return overlay;
    }
    
    public static final int c(final WorkDatabase workDatabase, final String s) {
        final Long a = workDatabase.s().a(s);
        int n = 0;
        int n2;
        if (a != null) {
            n2 = (int)(long)a;
        }
        else {
            n2 = 0;
        }
        if (n2 != Integer.MAX_VALUE) {
            n = n2 + 1;
        }
        d(workDatabase, s, n);
        return n2;
    }
    
    public static final void d(final WorkDatabase workDatabase, final String s, final int n) {
        workDatabase.s().b(new cqo(s, Long.valueOf(n)));
    }
    
    public static final Set e(byte[] array) {
        array.getClass();
        final LinkedHashSet set = new LinkedHashSet();
        if (array.length == 0) {
            return set;
        }
        array = (byte[])(Object)new ByteArrayInputStream(array);
        try {
            final ObjectInputStream objectInputStream = new ObjectInputStream((InputStream)(Object)array);
            try {
                for (int int1 = objectInputStream.readInt(), i = 0; i < int1; ++i) {
                    final Uri parse = Uri.parse(objectInputStream.readUTF());
                    final boolean boolean1 = objectInputStream.readBoolean();
                    parse.getClass();
                    set.add(new cmh(parse, boolean1));
                }
                auek.c(objectInputStream, null);
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    auek.c(objectInputStream, t);
                }
            }
        }
        catch (final IOException ex) {}
        finally {
            try {}
            finally {
                auek.c((Closeable)(Object)array, (Throwable)set);
                while (true) {}
            }
            auek.c((Closeable)(Object)array, null);
            return set;
        }
    }
    
    public static final int f(int n) {
        if (n == 0) {
            throw null;
        }
        final int n2 = n - 1;
        if (n2 != 0) {
            n = 1;
            if (n2 != 1) {
                n = 2;
                if (n2 != 2) {
                    n = 3;
                    if (n2 != 3) {
                        n = 4;
                        if (n2 != 4) {
                            return 5;
                        }
                    }
                }
            }
            return n;
        }
        return 0;
    }
    
    public static final int g(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (Build$VERSION.SDK_INT >= 30 && n == 5) {
            return 6;
        }
        final StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(n);
        sb.append(" to NetworkType");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final int h(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n == 5) {
            return 6;
        }
        final StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(n);
        sb.append(" to State");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final int i(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        final StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(n);
        sb.append(" to BackoffPolicy");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final int j(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        final StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(n);
        sb.append(" to OutOfQuotaPolicy");
        throw new IllegalArgumentException(sb.toString());
    }
}
