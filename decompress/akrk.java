import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrk extends ahcz implements aheo
{
    public static final akrk a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akrk.class, a = new akrk());
    }
    
    private akrk() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akrk.d) == null) {
                    synchronized (akrk.class) {
                        if (akrk.d == null) {
                            akrk.d = (ahev)new ahcs((ahcz)akrk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akrk.a;
            }
            case 4: {
                return new ahcr((ahcz)akrk.a);
            }
            case 3: {
                return new akrk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrk.a, "\u0001\u0001\u0001\u0000\ue315\u1baf\ue315\u1baf\u0001\u0000\u0000\u0001\ue315\u1baf\u143c\u0000", new Object[] { "c", "b", ahsu.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
