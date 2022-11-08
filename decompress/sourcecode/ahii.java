import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahii extends agzi implements ahax
{
    public static final agzr a;
    public static final ahii b;
    private static volatile ahbe e;
    public boolean c;
    public agzq d;
    private int f;
    private aioe g;
    private byte h;
    
    static {
        a = (agzr)new prz(9);
        agzi.registerDefaultInstance(ahii.class, b = new ahii());
    }
    
    private ahii() {
        this.h = 2;
        this.d = agzi.emptyIntList();
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
                final ahbe e;
                if ((e = ahii.e) == null) {
                    synchronized (ahii.class) {
                        if (ahii.e == null) {
                            ahii.e = (ahbe)new agzb((agzi)ahii.b);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahii.b;
            }
            case 4: {
                return new agza((agzi)ahii.b);
            }
            case 3: {
                return new ahii();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahii.b, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001\u1007\u0000\u0003\u1409\u0003\u0005\u001e", new Object[] { "f", "c", "g", "d", ahih.a() });
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
