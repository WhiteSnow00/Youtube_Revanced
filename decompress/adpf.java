import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpf extends ahcz implements aheo
{
    public static final adpf a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahbt d;
    
    static {
        ahcz.registerDefaultInstance(adpf.class, a = new adpf());
    }
    
    private adpf() {
        this.c = "";
        this.d = ahbt.b;
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
                if ((e = adpf.e) == null) {
                    synchronized (adpf.class) {
                        if (adpf.e == null) {
                            adpf.e = (ahev)new ahcs((ahcz)adpf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return adpf.a;
            }
            case 4: {
                return new ahcr((ahcz)adpf.a);
            }
            case 3: {
                return new adpf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adpf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
