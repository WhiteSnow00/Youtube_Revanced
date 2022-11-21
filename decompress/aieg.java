import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieg extends ahcz implements aheo
{
    public static final aieg a;
    private static volatile ahev e;
    public int b;
    public Object c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(aieg.class, a = new aieg());
    }
    
    private aieg() {
        this.b = 0;
        this.d = ahcz.emptyProtobufList();
        ahcz.emptyProtobufList();
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
                if ((e = aieg.e) == null) {
                    synchronized (aieg.class) {
                        if (aieg.e == null) {
                            aieg.e = (ahev)new ahcs((ahcz)aieg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aieg.a;
            }
            case 4: {
                return new ahcr((int[][])null, (int[])null);
            }
            case 3: {
                return new aieg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aieg.a, "\u0001\u000f\u0001\u0000\u0001\uf369\ue1e4\u0007\u000f\u0000\u0001\u0000\u0001\u001a\uec71\u3ed5\u103c\u0000\ufef7\u7c5c\u103c\u0000\uf239\u7f1a\u103c\u0000\ue779\u8f06\u103c\u0000\ue17a\u912d\u103c\u0000\ue8c6\u9233\u103c\u0000\uf646\u9cb5\u103c\u0000\ue62a\ua5e7\u103c\u0000\ueacc\ubbb8\u103c\u0000\uf126\ud1e3\u103c\u0000\uefc8\ud249\u103c\u0000\ue950\ud725\u103c\u0000\uf40d\ud787\u103c\u0000\uf369\ue1e4\u0007\u103c\u0000", new Object[] { "c", "b", "d", apdy.class, ahla.class, aiii.class, ahjy.class, aivn.class, apov.class, apyo.class, ajuw.class, aoui.class, antn.class, aiei.class, ankm.class, annc.class, aoln.class });
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
