import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apld extends agzi implements ahax
{
    public static final apld a;
    private static volatile ahbe d;
    public int b;
    public amfs c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apld.class, a = new apld());
    }
    
    private apld() {
        this.e = 2;
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
                final ahbe d;
                if ((d = apld.d) == null) {
                    synchronized (apld.class) {
                        if (apld.d == null) {
                            apld.d = (ahbe)new agzb((agzi)apld.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apld.a;
            }
            case 4: {
                return new agza((agzi)apld.a);
            }
            case 3: {
                return new apld();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apld.a, "\u0001\u0001\u0000\u0001\ue5b3\u21fc\ue5b3\u21fc\u0001\u0000\u0000\u0001\ue5b3\u21fc\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
