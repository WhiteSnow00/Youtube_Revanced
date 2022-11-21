import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcy extends ahcz implements aheo
{
    public static final akcy a;
    private static volatile ahev e;
    public int b;
    public ahbt c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(akcy.class, a = new akcy());
    }
    
    private akcy() {
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = akcy.e) == null) {
                    synchronized (akcy.class) {
                        if (akcy.e == null) {
                            akcy.e = (ahev)new ahcs((ahcz)akcy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akcy.a;
            }
            case 4: {
                return new ahcr((ahcz)akcy.a);
            }
            case 3: {
                return new akcy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
