import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkk extends agzi implements ahax
{
    public static final ahkk a;
    private static volatile ahbe e;
    public int b;
    public aioe c;
    public String d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ahkk.class, (agzi)(a = new ahkk()));
    }
    
    private ahkk() {
        this.g = 2;
        this.d = "";
        final agyc b = agyc.b;
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
                final ahbe e;
                if ((e = ahkk.e) == null) {
                    synchronized (ahkk.class) {
                        if (ahkk.e == null) {
                            ahkk.e = (ahbe)new agzb((agzi)ahkk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahkk.a;
            }
            case 4: {
                return new agza((agzi)ahkk.a);
            }
            case 3: {
                return new ahkk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkk.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0003\u0005\u1008\u0002", new Object[] { "b", "c", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
