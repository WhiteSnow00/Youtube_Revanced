import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoiw extends ahcz implements aheo
{
    public static final aoiw a;
    public static final ahcx b;
    private static volatile ahev d;
    public anxb c;
    private int e;
    private ajws f;
    private byte g;
    
    static {
        final aoiw a2 = new aoiw();
        ahcz.registerDefaultInstance(aoiw.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 387380578, ahgc.k, aoiw.class);
    }
    
    private aoiw() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aoiw.d) == null) {
                    synchronized (aoiw.class) {
                        if (aoiw.d == null) {
                            aoiw.d = (ahev)new ahcs((ahcz)aoiw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoiw.a;
            }
            case 4: {
                return new ahcr((ahcz)aoiw.a);
            }
            case 3: {
                return new aoiw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoiw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "c", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
