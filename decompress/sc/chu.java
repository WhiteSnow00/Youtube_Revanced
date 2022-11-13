import android.os.Build$VERSION;
import java.io.IOException;
import java.io.Closeable;
import android.net.Uri;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import android.animation.Animator$AnimatorPauseListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chu
{
    static void a(final Animator animator, final AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener((Animator$AnimatorPauseListener)animatorListenerAdapter);
    }
    
    static void b(final Animator animator) {
        animator.pause();
    }
    
    static void c(final Animator animator) {
        animator.resume();
    }
    
    public static final Set d(byte[] array) {
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
                    set.add(new cme(parse, boolean1));
                }
                aubn.c(objectInputStream, null);
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    aubn.c(objectInputStream, t);
                }
            }
        }
        catch (final IOException ex) {}
        finally {
            try {}
            finally {
                aubn.c((Closeable)(Object)array, (Throwable)set);
                while (true) {}
            }
            aubn.c((Closeable)(Object)array, null);
            return set;
        }
    }
    
    public static final int e(int n) {
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
    
    public static final int f(final int n) {
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
        if (n == 5) {
            return 6;
        }
        final StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(n);
        sb.append(" to State");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final int h(final int n) {
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
    
    public static final int i(final int n) {
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
    
    public static final cqw j(final crh crh) {
        crh.getClass();
        return new cqw(crh.c, crh.s);
    }
}
