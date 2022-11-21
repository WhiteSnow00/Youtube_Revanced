import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzg extends ahcz implements aheo
{
    public static final akzg a;
    private static volatile ahev f;
    public int b;
    public boolean c;
    public String d;
    public ahdp e;
    
    static {
        ahcz.registerDefaultInstance(akzg.class, a = new akzg());
    }
    
    private akzg() {
        this.d = "";
        this.e = ahcz.emptyProtobufList();
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
                if ((f = akzg.f) == null) {
                    synchronized (akzg.class) {
                        if (akzg.f == null) {
                            akzg.f = (ahev)new ahcs((ahcz)akzg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akzg.a;
            }
            case 4: {
                return new ahcr((char[][][])null, (int[][])null);
            }
            case 3: {
                return new akzg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1008\u0001\u0003\u001a", new Object[] { "b", "c", "d", "e" });
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
