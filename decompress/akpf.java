import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpf extends ahcz implements aheo
{
    public static final akpf a;
    private static volatile ahev f;
    public int b;
    public int c;
    public ahbt d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(akpf.class, a = new akpf());
    }
    
    private akpf() {
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
                final ahev f;
                if ((f = akpf.f) == null) {
                    synchronized (akpf.class) {
                        if (akpf.f == null) {
                            akpf.f = (ahev)new ahcs((ahcz)akpf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akpf.a;
            }
            case 4: {
                return new ahcr((ahcz)akpf.a);
            }
            case 3: {
                return new akpf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpf.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100a\u0001\u0003\u1007\u0002", new Object[] { "b", "c", ajsh.a(), "d", "e" });
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
