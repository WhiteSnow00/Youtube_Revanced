import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyn extends agzi implements ahax
{
    public static final ajyn a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public int d;
    public int e;
    public int f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ajyn.class, a = new ajyn());
    }
    
    private ajyn() {
        this.h = 2;
        this.c = "";
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
                if ((g = ajyn.g) == null) {
                    synchronized (ajyn.class) {
                        if (ajyn.g == null) {
                            ajyn.g = (ahbe)new agzb((agzi)ajyn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajyn.a;
            }
            case 4: {
                return new agza((agzi)ajyn.a);
            }
            case 3: {
                return new ajyn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyn.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0005\u100c\u0004", new Object[] { "b", "c", "d", ajwj.e, "e", ajyk.a(), "f", ajwj.d });
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
