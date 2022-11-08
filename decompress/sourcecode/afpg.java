import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpg extends agzi implements ahax
{
    public static final afpg a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public String e;
    public int f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(afpg.class, a = new afpg());
    }
    
    private afpg() {
        this.h = 2;
        this.c = "";
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = afpg.g) == null) {
                    synchronized (afpg.class) {
                        if (afpg.g == null) {
                            afpg.g = (ahbe)new agzb((agzi)afpg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return afpg.a;
            }
            case 4: {
                return new agza((agzi)afpg.a);
            }
            case 3: {
                return new afpg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpg.a, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005\u1508\u0000\u0006\u1508\u0001\u0007\u1008\u0002\b\u1504\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
