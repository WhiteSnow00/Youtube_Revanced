import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjk extends ahcz implements aheo
{
    public static final apjk a;
    private static volatile ahev e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(apjk.class, a = new apjk());
    }
    
    private apjk() {
        this.c = "";
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
                if ((e = apjk.e) == null) {
                    synchronized (apjk.class) {
                        if (apjk.e == null) {
                            apjk.e = (ahev)new ahcs((ahcz)apjk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apjk.a;
            }
            case 4: {
                return new ahcr((ahcz)apjk.a);
            }
            case 3: {
                return new apjk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
