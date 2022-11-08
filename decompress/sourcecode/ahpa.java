import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpa extends agzi implements ahax
{
    public static final ahpa a;
    private static volatile ahbe i;
    public int b;
    public String c;
    public String d;
    public boolean e;
    public aioe f;
    public boolean g;
    public agyc h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ahpa.class, a = new ahpa());
    }
    
    private ahpa() {
        this.k = 2;
        this.c = "";
        this.d = "";
        this.h = agyc.b;
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
                final ahbe i;
                if ((i = ahpa.i) == null) {
                    synchronized (ahpa.class) {
                        if (ahpa.i == null) {
                            ahpa.i = (ahbe)new agzb((agzi)ahpa.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahpa.a;
            }
            case 4: {
                return new agza((agzi)ahpa.a);
            }
            case 3: {
                return new ahpa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpa.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001\u1008\u0001\u0002\u1409\u0005\u0003\u100a\u0006\u0004\u1008\u0000\u0005\u1409\u0003\u0006\u1007\u0004\u0007\u1007\u0002", new Object[] { "b", "d", "j", "h", "c", "f", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
