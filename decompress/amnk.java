import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnk extends ahcz implements aheo
{
    public static final amnk a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amnk.class, a = new amnk());
    }
    
    private amnk() {
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
                if ((d = amnk.d) == null) {
                    synchronized (amnk.class) {
                        if (amnk.d == null) {
                            amnk.d = (ahev)new ahcs((ahcz)amnk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amnk.a;
            }
            case 4: {
                return new ahcr((ahcz)amnk.a);
            }
            case 3: {
                return new amnk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnk.a, "\u0001\u0004\u0001\u0000\ue9be\u24cf\uf723\u9d0e\u0004\u0000\u0000\u0004\ue9be\u24cf\u143c\u0000\uecd4\u3b13\u143c\u0000\ufa62\u814f\u143c\u0000\uf723\u9d0e\u143c\u0000", new Object[] { "c", "b", ahlq.class, amns.class, aiht.class, ajvh.class });
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
