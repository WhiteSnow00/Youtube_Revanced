import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmd extends ahcz implements aheo
{
    public static final ajmd a;
    private static volatile ahev d;
    public int b;
    public ajmc c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ajmd.class, a = new ajmd());
    }
    
    private ajmd() {
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
                if ((d = ajmd.d) == null) {
                    synchronized (ajmd.class) {
                        if (ajmd.d == null) {
                            ajmd.d = (ahev)new ahcs((ahcz)ajmd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajmd.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmd.a);
            }
            case 3: {
                return new ajmd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmd.a, "\u0001\u0001\u0000\u0001\uee5d\u21e7\uee5d\u21e7\u0001\u0000\u0000\u0001\uee5d\u21e7\u1409\u0000", new Object[] { "b", "c" });
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
