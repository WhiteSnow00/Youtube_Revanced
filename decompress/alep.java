import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alep extends ahcz implements aheo
{
    public static final alep a;
    private static volatile ahev i;
    public int b;
    public aknh c;
    public String d;
    public int e;
    public appc f;
    public boolean g;
    public amoc h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(alep.class, a = new alep());
    }
    
    private alep() {
        this.j = 2;
        this.d = "";
        this.e = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = alep.i) == null) {
                    synchronized (alep.class) {
                        if (alep.i == null) {
                            alep.i = (ahev)new ahcs((ahcz)alep.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alep.a;
            }
            case 4: {
                return new ahcr((ahcz)alep.a);
            }
            case 3: {
                return new alep();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alep.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0005\u1009\u0004\u0006\u1007\u0005\u0007\u1009\u0006", new Object[] { "b", "c", "d", "e", akyi.o, "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
