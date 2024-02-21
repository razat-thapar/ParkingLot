

INSERT INTO parking_lot (name,address,created_at)
VALUES
('Delhities','#B G ROAD , Delhi',CURRENT_TIMESTAMP),
('Bengalurites','#Marathali , Bengaluru',CURRENT_TIMESTAMP);

INSERT INTO parking_floor (parking_lot_id,floor_number,created_at)
VALUES
(1,0,CURRENT_TIMESTAMP),
(1,1,CURRENT_TIMESTAMP);

INSERT INTO parking_spot (parking_floor_id,spot_number,spot_status,spot_type,created_at)
VALUES
(1,1,0,0,CURRENT_TIMESTAMP),
(1,2,0,1,CURRENT_TIMESTAMP),
(1,3,0,2,CURRENT_TIMESTAMP),
(2,1,0,0,CURRENT_TIMESTAMP),
(2,2,0,1,CURRENT_TIMESTAMP),
(2,3,0,2,CURRENT_TIMESTAMP);

-- display board
INSERT INTO display_board (floor_id,created_at)
VALUES
(1,CURRENT_TIMESTAMP), -- entry gate , ground floor.
(2,CURRENT_TIMESTAMP); -- 1st floor.
-- operator
INSERT INTO operator (name,email,phone_number,created_at)
VALUES
('Razat','abc@g.com',9823423242,CURRENT_TIMESTAMP),
('akl2','def@g.com',9823423243,CURRENT_TIMESTAMP),
('Anagh3','ghi@g.com',9823423244,CURRENT_TIMESTAMP);
-- entry gate
INSERT INTO entry_gate (parking_lot_id,floor_id,display_board_id,operator_id,number,gate_type,created_at)
VALUES
(1,1,1,1,1,0,CURRENT_TIMESTAMP),
(1,2,2,2,1,0,CURRENT_TIMESTAMP);
-- payment counter
INSERT INTO payment_counter (floor_id,created_at)
VALUES
(1,CURRENT_TIMESTAMP), -- exit gate counter, ground floor
(2,CURRENT_TIMESTAMP); -- 1st floor counter.
-- exit gate
INSERT INTO exit_gate (parking_lot_id,floor_id,payment_counter_id,operator_id,number,gate_type,created_at)
VALUES
(1,1,1,3,1,1,CURRENT_TIMESTAMP),
(1,2,2,2,2,1,CURRENT_TIMESTAMP);
-- vehicle.
INSERT INTO vehicle (registration_number,vehicle_type,created_at)
VALUES
('PB11BB2343',0,CURRENT_TIMESTAMP),
('PB11B123kj',1,CURRENT_TIMESTAMP),
('PB11BV3239',2,CURRENT_TIMESTAMP);
-- ticket