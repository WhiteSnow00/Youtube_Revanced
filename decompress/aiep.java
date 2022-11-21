import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiep extends ahcz implements aheo
{
    public static final aiep a;
    private static volatile ahev m;
    public int b;
    public ajws c;
    public ajws d;
    public ahdp e;
    public ahdp f;
    public aisc g;
    public anxb h;
    public String i;
    public int j;
    public aowb k;
    public ahbt l;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(aiep.class, a = new aiep());
    }
    
    private aiep() {
        this.o = 2;
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        this.i = "";
        this.l = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = aiep.m) == null) {
                    synchronized (aiep.class) {
                        if (aiep.m == null) {
                            aiep.m = (ahev)new ahcs((ahcz)aiep.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aiep.a;
            }
            case 4: {
                return new ahcr((ahcz)aiep.a);
            }
            case 3: {
                return new aiep();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiep.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u041b\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u1008\u0004\b\u1409\b\t\u100a\u0007\n\u100c\u0005\u000b\u1409\u0006", new Object[] { "b", "c", "d", "e", ajws.class, "f", aowb.class, "g", "h", "i", "n", "l", "j", aidb.p, "k" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
