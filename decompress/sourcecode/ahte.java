import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahte extends agzi implements ahax
{
    public static final ahte a;
    private static volatile ahbe f;
    public int b;
    public aioe c;
    public aioe d;
    public String e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahte.class, a = new ahte());
    }
    
    private ahte() {
        this.g = 2;
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
                final ahbe f;
                if ((f = ahte.f) == null) {
                    synchronized (ahte.class) {
                        if (ahte.f == null) {
                            ahte.f = (ahbe)new agzb((agzi)ahte.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahte.a;
            }
            case 4: {
                return new agza((agzi)ahte.a);
            }
            case 3: {
                return new ahte();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahte.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
