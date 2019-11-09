import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MobileCOmponentComponent } from './mobile-component.component';

describe('MobileCOmponentComponent', () => {
  let component: MobileCOmponentComponent;
  let fixture: ComponentFixture<MobileCOmponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MobileCOmponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MobileCOmponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
