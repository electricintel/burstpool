package burst.pool.miners;

import burst.kit.entity.BurstAddress;
import burst.kit.entity.BurstValue;
import burst.pool.storage.config.PropertyService;
import burst.pool.storage.config.Props;

import java.util.concurrent.atomic.AtomicReference;

public class PoolFeeRecipient implements IMiner {
    private final PropertyService propertyService;
    private final AtomicReference<BurstValue> pending;
    private final AtomicReference<String> name;

    public PoolFeeRecipient(PropertyService propertyService, BurstValue pending, String name) {
        this.propertyService = propertyService;
        this.pending = new AtomicReference<>(pending);
        this.name = new AtomicReference<>(name);
    }

    @Override
    public void processNewDeadline(Deadline deadline) {
    }

    @Override
    public void recalculateCapacity(long currentBlockHeight) {
    }

    @Override
    public void recalculateShare(double poolCapacity) {
    }

    @Override
    public void increasePending(BurstValue delta) {
        pending.updateAndGet(pending -> new BurstValue(pending.add(delta)));
    }

    @Override
    public void decreasePending(BurstValue delta) {
        pending.updateAndGet(pending -> new BurstValue(pending.subtract(delta)));
    }

    @Override
    public BurstValue takeShare(BurstValue availableReward) {
        return BurstValue.fromBurst(0);
    }

    @Override
    public double getCapacity() {
        return 0;
    }

    @Override
    public BurstValue getPending() {
        return pending.get();
    }

    @Override
    public BurstAddress getAddress() {
        return propertyService.getBurstAddress(Props.feeRecipient);
    }

    @Override
    public double getShare() {
        return 0;
    }

    @Override
    public int getNConf() {
        return 0;
    }

    @Override
    public String getName() {
        return name.get();
    }

    @Override
    public void setName(String name) {
        this.name.set(name);
    }

    @Override
    public String getUserAgent() {
        return "Pool Fee Recipient";
    }

    @Override
    public void setUserAgent(String userAgent) {
    }
}
