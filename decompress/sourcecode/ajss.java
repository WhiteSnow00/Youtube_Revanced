import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajss extends agzd implements agze
{
    public static final ajss a;
    private static volatile ahbe o;
    public int b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public aioe m;
    public alts n;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)ajss.class, (agzi)(a = new ajss()));
    }
    
    private ajss() {
        this.p = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe o3;
                if ((o3 = ajss.o) == null) {
                    synchronized (ajss.class) {
                        if (ajss.o == null) {
                            ajss.o = (ahbe)new agzb((agzi)ajss.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajss.a;
            }
            case 4: {
                return new agzc(ajss.a);
            }
            case 3: {
                return new ajss();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajss.a, "\u0001\u000b\u0000\u0001\u0001\u03e7\u000b\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1409\n\u0006\u1007\u0004\b\u100b\u0007\t\u100c\t\n\u1007\u0005\u000b\u100b\b\u03e7\u1409\u000b", new Object[] { "b", "c", "d", "e", "f", "m", "g", "i", "k", ajrv.l, "h", "j", "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
