import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoy extends agzi implements ahax
{
    public static final ahoy a;
    private static volatile ahbe g;
    public int b;
    public agyc c;
    public String d;
    public String e;
    public aioe f;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ahoy.class, a = new ahoy());
    }
    
    private ahoy() {
        this.i = 2;
        this.c = agyc.b;
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
                if ((g = ahoy.g) == null) {
                    synchronized (ahoy.class) {
                        if (ahoy.g == null) {
                            ahoy.g = (ahbe)new agzb((agzi)ahoy.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahoy.a;
            }
            case 4: {
                return new agza((agzi)ahoy.a);
            }
            case 3: {
                return new ahoy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahoy.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1409\u0004", new Object[] { "b", "h", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
