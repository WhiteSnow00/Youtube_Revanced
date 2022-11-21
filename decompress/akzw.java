import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzw extends ahcz implements aheo
{
    public static final akzw a;
    private static volatile ahev i;
    public int b;
    public aknh c;
    public String d;
    public ahdp e;
    public String f;
    public int g;
    public String h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(akzw.class, a = new akzw());
    }
    
    private akzw() {
        this.j = 2;
        this.d = "";
        this.e = ahcz.emptyProtobufList();
        this.f = "";
        this.h = "";
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
                if ((i = akzw.i) == null) {
                    synchronized (akzw.class) {
                        if (akzw.i == null) {
                            akzw.i = (ahev)new ahcs((ahcz)akzw.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akzw.a;
            }
            case 4: {
                return new ahcr((char[][])null, (byte[][][])null);
            }
            case 3: {
                return new akzw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzw.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1008\u0002\u0003\u001a\u0004\u100c\u0004\u0006\u1008\u0003\u0007\u1008\u0006", new Object[] { "b", "c", "d", "e", "g", ankj.m, "f", "h" });
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
