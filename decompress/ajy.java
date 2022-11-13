import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajy implements ako
{
    final Object a;
    private final int b;
    
    public ajy(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ajy(final kg a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public final void accept(Object c) {
        if (this.b != 0) {
            argj argj;
            if ((argj = (argj)c) == null) {
                argj = new argj(-3, (char[])null, (byte[])null, (byte[])null);
            }
            ((kg)this.a).F(argj);
            return;
        }
        final argj argj2 = (argj)c;
        c = ajz.c;
        monitorenter(c);
        try {
            final ArrayList list = (ArrayList)ajz.d.get(this.a);
            if (list == null) {
                monitorexit(c);
                return;
            }
            ajz.d.remove(this.a);
            monitorexit(c);
            for (int i = 0; i < list.size(); ++i) {
                ((ako)list.get(i)).accept((Object)argj2);
            }
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
}
