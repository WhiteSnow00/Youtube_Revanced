import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akph extends ahcz implements aheo
{
    public static final akph a;
    private static volatile ahev i;
    public aknj b;
    public int c;
    public String d;
    public boolean e;
    public ahbt f;
    public ahdp g;
    public boolean h;
    private int j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(akph.class, a = new akph());
    }
    
    private akph() {
        this.k = 2;
        this.d = "";
        this.f = ahbt.b;
        this.g = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = akph.i) == null) {
                    synchronized (akph.class) {
                        if (akph.i == null) {
                            akph.i = (ahev)new ahcs((ahcz)akph.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akph.a;
            }
            case 4: {
                return new ahcr((ahcz)akph.a);
            }
            case 3: {
                return new akph();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akph.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u1007\u0003\u0005\u100a\u0004\u0006\u001b\u000b\u1007\t", new Object[] { "j", "b", "c", ajse.h, "d", "e", "f", "g", akpf.class, "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
