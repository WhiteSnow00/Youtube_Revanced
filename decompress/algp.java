import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algp extends ahcz implements aheo
{
    public static final algp a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algp.class, a = new algp());
    }
    
    private algp() {
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
                if ((d = algp.d) == null) {
                    synchronized (algp.class) {
                        if (algp.d == null) {
                            algp.d = (ahev)new ahcs((ahcz)algp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algp.a;
            }
            case 4: {
                return new ahcr((ahcz)algp.a);
            }
            case 3: {
                return new algp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algp.a, "\u0001\u0003\u0001\u0000\uea3a\u1bbd\ufbc8\u6b6c\u0003\u0000\u0000\u0003\uea3a\u1bbd\u143c\u0000\ue2ad\u5355\u143c\u0000\ufbc8\u6b6c\u143c\u0000", new Object[] { "c", "b", aotv.class, apfp.class, aphs.class });
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
