-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试代码自动生成', '1', '1', 'testUser', 'test/testUser/index', 1, 0, 'C', '0', '0', 'test:testUser:list', '#', 'admin', sysdate(), '', null, '测试代码自动生成菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试代码自动生成查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'test:testUser:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试代码自动生成新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'test:testUser:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试代码自动生成修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'test:testUser:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试代码自动生成删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'test:testUser:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试代码自动生成导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'test:testUser:export',       '#', 'admin', sysdate(), '', null, '');